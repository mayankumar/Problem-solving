from locust import HttpLocust, TaskSet, task, between
import uuid
import json


class UserBehavior(TaskSet):
    """
    1. Install Locust : pip3 install locustio
    2. Run the locust with below command on terminal:
        locust --host=HOST_TO_BE_TESTED --locustfile testingFile
        Sample : locust --host=http://localhost:5002 --locustfile load_testing.py
    3. Open Browser at localhost:8089 and run the load tests
    """

    @task(1)
    def purl_shortening_test(self):
        data = {
            "long_urls": [
                {
                    "long_url": "https://www.google.com",
                    "user_id": 2,
                    "title": "google",
                    "description": "Don't be evil",
                    "expires_on": None
                },
                {
                    "long_url": "https://www.facebook.com",
                    "user_id": 2,
                    "title": "facebook",
                    "description": "Its quick and easy ",
                    "expires_on": None
                },
                {
                    "long_url": "https://www.amazon.com",
                    "user_id": 2,
                    "title": "amazon",
                    "description": "a to z",
                    "expires_on": None
                }
            ]
        }

        headers = {'Content-Type': 'application/json'}
        # print(auth_header)

        self.client.post("/shorturls", data=json.dumps(data),
                         headers=headers)


class WebsiteUser(HttpLocust):
    task_set = UserBehavior
    wait_time = between(1, 3)
