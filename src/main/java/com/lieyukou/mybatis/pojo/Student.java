package com.lieyukou.mybatis.pojo;

public class Student {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.id
     *
     * @mbggenerated Tue Nov 01 20:15:52 CST 2022
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.name
     *
     * @mbggenerated Tue Nov 01 20:15:52 CST 2022
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.age
     *
     * @mbggenerated Tue Nov 01 20:15:52 CST 2022
     */
    private String age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.id
     *
     * @return the value of student.id
     *
     * @mbggenerated Tue Nov 01 20:15:52 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.id
     *
     * @param id the value for student.id
     *
     * @mbggenerated Tue Nov 01 20:15:52 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.name
     *
     * @return the value of student.name
     *
     * @mbggenerated Tue Nov 01 20:15:52 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.name
     *
     * @param name the value for student.name
     *
     * @mbggenerated Tue Nov 01 20:15:52 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.age
     *
     * @return the value of student.age
     *
     * @mbggenerated Tue Nov 01 20:15:52 CST 2022
     */
    public String getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.age
     *
     * @param age the value for student.age
     *
     * @mbggenerated Tue Nov 01 20:15:52 CST 2022
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }
}