package com.casnav.testeapi.ssgnApi.entities.montagem_jogos;

import jakarta.persistence.*;

@Entity(name = "TransporteAeronave")
@Table(schema = "montagem_jogos")
public class TransporteAeronave {
    @EmbeddedId
    private TransporteAeronaveId id;

    @MapsId("idClassenavio")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_ClasseNavio", nullable = false)
    private ClasseNavio idClassenavio;

    @MapsId("idTipoaeronave")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Id_TipoAeronave", nullable = false)
    private TipoAeronave idTipoaeronave;

    public TransporteAeronaveId getId() {
        return id;
    }

    public TransporteAeronave setId(TransporteAeronaveId id) {
        this.id = id;
        return this;
    }

    public ClasseNavio getIdClassenavio() {
        return idClassenavio;
    }

    public TransporteAeronave setIdClassenavio(ClasseNavio idClassenavio) {
        this.idClassenavio = idClassenavio;
        return this;
    }

    public TipoAeronave getIdTipoaeronave() {
        return idTipoaeronave;
    }

    public TransporteAeronave setIdTipoaeronave(TipoAeronave idTipoaeronave) {
        this.idTipoaeronave = idTipoaeronave;
        return this;
    }

}