from locust import HttpLocust, TaskSet, task
from random import randint

class UserBehavior(TaskSet):
    @task
    def sum_operation(self):
        operation_value = randint(1,101)

        payload = {"operation":"SUM", "parameters":[100, operation_value]}
        headers = {'content-type': 'application/json'}

        response = self.client.post("/math/operation", json=payload, headers=headers)
        print("Response status code:", response.status_code)
        print("Response content:", response.text)

class WebsiteUser(HttpLocust):
    task_set = UserBehavior
    min_wait = 5000
    max_wait = 9000