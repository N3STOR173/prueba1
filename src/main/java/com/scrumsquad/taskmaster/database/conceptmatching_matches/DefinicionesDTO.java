package com.scrumsquad.taskmaster.database.conceptmatching_matches;

import java.util.Objects;

public class DefinicionesDTO {
    private Integer id;
    private String descripcion;
    private Integer conceptoId;

    public DefinicionesDTO(Integer id, String definicion, Integer nConcepto) {
        this.id = id;
        this.descripcion = definicion;
        this.conceptoId = nConcepto;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getConceptoId() {
        return conceptoId;
    }

    public void setConceptoId(Integer conceptoId) {
        this.conceptoId = conceptoId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DefinicionesDTO that = (DefinicionesDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(conceptoId, that.conceptoId) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descripcion, conceptoId);
    }
}
