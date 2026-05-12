import React from 'react';

const ListaCoincidencias = ({ coincidencias }) => {
    return (
        <div>
            <h2>Coincidencias Encontradas</h2>
            <ul>
                {coincidencias && coincidencias.map(match => (
                    <li key={match.id}>
                        Mascota Perdida: {match.id_mascota_perdida} - Mascota Encontrada: {match.id_mascota_encontrada} ({match.porcentaje_similitud}%)
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default ListaCoincidencias;
