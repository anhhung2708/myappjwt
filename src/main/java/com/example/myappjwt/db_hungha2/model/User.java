package com.example.myappjwt.db_hungha2.model;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;

public class User {
	
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_hungha2.auth_user.id
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_hungha2.auth_user.username
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_hungha2.auth_user.userpassword
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    private String userpassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_hungha2.auth_user.first_name
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_hungha2.auth_user.last_name
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_hungha2.auth_user.email
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_hungha2.auth_user.insert_date
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    private Date insertDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_hungha2.auth_user.department_id
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    private Integer departmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_hungha2.auth_user.team_id
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    private Integer teamId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_hungha2.auth_user.id
     *
     * @return the value of db_hungha2.auth_user.id
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_hungha2.auth_user.id
     *
     * @param id the value for db_hungha2.auth_user.id
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_hungha2.auth_user.username
     *
     * @return the value of db_hungha2.auth_user.username
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_hungha2.auth_user.username
     *
     * @param username the value for db_hungha2.auth_user.username
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_hungha2.auth_user.userpassword
     *
     * @return the value of db_hungha2.auth_user.userpassword
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public String getUserpassword() {
        return userpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_hungha2.auth_user.userpassword
     *
     * @param userpassword the value for db_hungha2.auth_user.userpassword
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_hungha2.auth_user.first_name
     *
     * @return the value of db_hungha2.auth_user.first_name
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_hungha2.auth_user.first_name
     *
     * @param firstName the value for db_hungha2.auth_user.first_name
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_hungha2.auth_user.last_name
     *
     * @return the value of db_hungha2.auth_user.last_name
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_hungha2.auth_user.last_name
     *
     * @param lastName the value for db_hungha2.auth_user.last_name
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_hungha2.auth_user.email
     *
     * @return the value of db_hungha2.auth_user.email
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_hungha2.auth_user.email
     *
     * @param email the value for db_hungha2.auth_user.email
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_hungha2.auth_user.insert_date
     *
     * @return the value of db_hungha2.auth_user.insert_date
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public Date getInsertDate() {
        return insertDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_hungha2.auth_user.insert_date
     *
     * @param insertDate the value for db_hungha2.auth_user.insert_date
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_hungha2.auth_user.department_id
     *
     * @return the value of db_hungha2.auth_user.department_id
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_hungha2.auth_user.department_id
     *
     * @param departmentId the value for db_hungha2.auth_user.department_id
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_hungha2.auth_user.team_id
     *
     * @return the value of db_hungha2.auth_user.team_id
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public Integer getTeamId() {
        return teamId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_hungha2.auth_user.team_id
     *
     * @param teamId the value for db_hungha2.auth_user.team_id
     *
     * @mbg.generated Wed Sep 25 09:14:02 ICT 2024
     */
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}
}