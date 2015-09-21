import string
import random
import subprocess
import json
import base64
import time

password_length = 12
user_name_length = 10
user_display_name_length = 10
email_address_length = 10

password = ''.join(random.choice(string.ascii_lowercase + string.digits) for _ in range(password_length))
user_name = ''.join(random.choice(string.ascii_lowercase) for _ in range(user_name_length))
user_display_name = ''.join(random.choice(string.ascii_lowercase) for _ in range(user_display_name_length))
email_address = ''.join(random.choice(string.ascii_lowercase) for _ in range(user_display_name_length)) + "@abcde.com"

def cmd(cmd):
    print cmd
    return subprocess.check_output(cmd, shell=True)

#endpoint = "api-gamma.tasteit.io"
#proto = "https"
#port = "443"

endpoint = "localhost"
proto = "http"
port = "8080"

url_prefix = "{0}://{1}:{2}".format(proto, endpoint, port)

# register a new user
response_body = cmd(""" /usr/bin/curl -H "Content-Type: application/json" -d '{{"password":"{0}", "user_name":"{1}", "grant_type":"user_password", "email_address":"{2}", "user_display_name":"{3}"}}' {4}/v1/users/register -X POST -v """.format(password, user_name, email_address, user_display_name, url_prefix))
print response_body

# login a user to get access token
response_body = cmd(""" curl  -H "Content-Type: application/json" -d '{{"password":"{0}", "login_name":"{1}", "grant_type":"user_password"}}' {2}/v1/tokens -X POST """.format(password, user_name, url_prefix))
print response_body

response_json = json.loads(response_body)
access_token = response_json['access_token']
principal = str(response_json['principal'])

auth_token = base64.b64encode(principal + ":" + access_token)
response_body = cmd(""" curl -H "Authorization: Bearer {0}" {1}/v1/users/profile/{2} """.format(auth_token, url_prefix, principal))
print "user profile"
print response_body

geo_rest_cuisine_id = "c22z-106486744811170325-0001"
response_body = cmd(""" curl -H "Authorization: Bearer {0}" {1}/v1/users/favorite/{2}?cuisine_id={2} -X POST""".format(auth_token, url_prefix, geo_rest_cuisine_id))
print "favorite cuisine " + geo_rest_cuisine_id
print response_body

#test update device token
response_body = cmd(""" curl -H "Authorization: Bearer {0}" -H "Content-Type: application/json" -d '{{"old_token":"dsfa12", "new_token":"12312312", "platform":"APNS"}}' {1}/v1/tokens/device -X PUT""".format(auth_token, url_prefix))
print "update token"
print response_body

