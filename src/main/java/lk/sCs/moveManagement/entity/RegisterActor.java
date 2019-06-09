package lk.sCs.moveManagement.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class RegisterActor {
    @EmbeddedId
    @Id
    private RegisterActorPK registerActorPK;
    private String role;
    @ManyToOne
    @JoinColumn(name="actorid",referencedColumnName = "id",insertable = false,updatable = false)
private Actor actorid;
    @ManyToOne
    @JoinColumn(name="moveid",referencedColumnName = "id",insertable = false,updatable = false)
    private Movie moveid;

    public Actor getActorid() {
        return actorid;
    }

    public Movie getMoveid() {
        return moveid;
    }


    public RegisterActor() {
    }

    public RegisterActor(RegisterActorPK registerActorPK, String role) {
        this.registerActorPK = registerActorPK;
        this.role = role;
    }

    public RegisterActorPK getRegisterActorPK() {
        return registerActorPK;
    }

    public void setRegisterActorPK(RegisterActorPK registerActorPK) {
        this.registerActorPK = registerActorPK;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "RegisterActor{" +
                "registerActorPK=" + registerActorPK +
                ", role='" + role + '\'' +
                '}';
    }

    public void setActorid(Actor actorid) {
        this.actorid = actorid;
    }

    public void setMoveid(Movie moveid) {
        this.moveid = moveid;
    }
}
