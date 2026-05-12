import React from 'react';

// Suponiendo que se usa una librería como Google Maps, Leaflet, etc.
const MapaCalor = ({ data }) => {
    return (
        <div>
            <h2>Mapa de Calor de Incidencias</h2>
            {/* Aquí iría la implementación del mapa */}
            <p>Mostrando {data ? data.length : 0} puntos de interés.</p>
        </div>
    );
};

export default MapaCalor;
