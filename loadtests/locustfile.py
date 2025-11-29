
from locust import HttpUser, task, between

class APIUser(HttpUser):
    wait_time = between(1,2)

    @task(3)
    def create(self):
        payload = {
            "client": {"nom":"Dupont","prenom":"Jean"},
            "chambre": {"id":1},
            "dateDebut":"2026-02-01",
            "dateFin":"2026-02-05",
            "preferences":"none"
        }
        self.client.post("/reservations", json=payload)
