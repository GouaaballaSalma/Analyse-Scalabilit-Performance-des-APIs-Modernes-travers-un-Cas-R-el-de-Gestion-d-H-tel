
import http from 'k6/http';
import { check } from 'k6';

export let options = {
  vus: __ENV.VUS ? Number(__ENV.VUS) : 100,
  duration: '30s',
};

const payload = JSON.stringify({
  client: { nom: "Dupont", prenom: "Jean", email: "j@d.com" },
  chambre: { id: 1 },
  dateDebut: "2026-02-01",
  dateFin: "2026-02-05",
  preferences: "none"
});

export default function () {
  const res = http.post('http://localhost:8080/reservations', payload, { headers: { 'Content-Type': 'application/json' } });
  check(res, { 'created': (r) => r.status === 201 });
}
