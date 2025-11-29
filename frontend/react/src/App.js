
import React, {useState} from 'react';
import axios from 'axios';
function App(){
  const [res, setRes] = useState(null);
  async function create(){
    const payload = { client: {nom:'Dupont', prenom:'Jean'}, chambre: {id:1}, dateDebut:'2026-02-01', dateFin:'2026-02-05', preferences:'none'};
    const r = await axios.post('http://localhost:8080/reservations', payload);
    setRes(r.data);
  }
  return (<div style={{padding:20}}><h3>Hotel API Test</h3><button onClick={create}>Create reservation</button><pre>{JSON.stringify(res,null,2)}</pre></div>);
}
export default App;
