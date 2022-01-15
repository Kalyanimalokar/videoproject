package hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;
    
    @Column(name="User_firstname")
    private String firstname;
    
    @Column(name="User_lastname")
    private String lastname;
    
    @Column(name="User_Name")
    private String username;
    
    @Column(name="User_Email")
    private String email;
    
    @Column(name="User_Cell")
    private String mobile;
    
    @Column(name="User_Status")
    private String status;
    
    @Column(name="User_Password")
    private String password;
    
    @Column(name="User_Ip")
    private String IPaddress; 

    public User() {
    	
    }

	public User(int idUser, String firstname, String lastname, String username, String email, String mobile, String status,
			String password, String iPaddress) {
		super();
		this.idUser = idUser;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.email = email;
		this.mobile = mobile;
		this.status = status;
		this.password = password;
		IPaddress = iPaddress;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIPaddress() {
		return IPaddress;
	}

	public void setIPaddress(String iPaddress) {
		IPaddress = iPaddress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", firstname=" + firstname + ", lastname=" + lastname + ", username="
				+ username + ", email=" + email + ", mobile=" + mobile + ", status=" + status + ", password=" + password
				+ ", IPaddress=" + IPaddress + "]";
	}
	
    
}

