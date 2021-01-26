package de.oette.course.G04;

import org.apache.commons.lang3.RandomStringUtils;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_company")
    private Company company;

    @Column(name = "client_number")
    private String clientNumber = RandomStringUtils.random(5, false, true);

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", company=" + company +
                ", clientNumber='" + clientNumber + '\'' +
                '}';
    }
}
