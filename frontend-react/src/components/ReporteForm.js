import React, { useState } from 'react';

const ReporteForm = () => {
    const [formData, setFormData] = useState({
        tipo_animal: '',
        raza: '',
        color_primario: '',
        tamano: 'Pequeño',
        foto_url: '',
        latitud: '',
        longitud: ''
    });

    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData(prevState => ({
            ...prevState,
            [name]: value
        }));
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        console.log(formData);
        // Aquí se haría el POST a /api/mascotas/reportar
    };

    return (
        <form onSubmit={handleSubmit}>
            <h2>Reportar Mascota</h2>
            <input name="tipo_animal" value={formData.tipo_animal} onChange={handleChange} placeholder="Tipo de Animal" />
            <input name="raza" value={formData.raza} onChange={handleChange} placeholder="Raza" />
            <input name="color_primario" value={formData.color_primario} onChange={handleChange} placeholder="Color Primario" />
            <select name="tamano" value={formData.tamano} onChange={handleChange}>
                <option value="Pequeño">Pequeño</option>
                <option value="Mediano">Mediano</option>
                <option value="Grande">Grande</option>
            </select>
            <input name="foto_url" value={formData.foto_url} onChange={handleChange} placeholder="URL de la Foto" />
            <input name="latitud" value={formData.latitud} onChange={handleChange} placeholder="Latitud" />
            <input name="longitud" value={formData.longitud} onChange={handleChange} placeholder="Longitud" />
            <button type="submit">Reportar</button>
        </form>
    );
};

export default ReporteForm;
