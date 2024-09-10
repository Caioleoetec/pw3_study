package br.com.etechoracio.pw3_study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_REL_MONITOR_DISPONIBILIDADE")
public class MonitorDisponibilidade {
    @OneToMany
    @Column(name = "ID_MONITOR")
    @JoinTable(name = "TBL_MONITOR")
    @JoinColumn(name = "ID_MONITOR")
    private Long idMonitor;
    @OneToMany
    @Column(name = "ID_DISPONIBILIDADE")
    @JoinTable(name = "TBL_DISPONIBILIDADE")
    @JoinColumn(name = "ID_DISPONIBILIDADE")
    private Long idDisponibilidade;
}
