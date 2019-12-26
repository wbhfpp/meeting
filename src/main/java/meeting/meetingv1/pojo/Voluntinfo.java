package meeting.meetingv1.pojo;

public class Voluntinfo {
    @Override
    public String toString() {
        return "Voluntinfo{" +
                "userid=" + userid +
                ", meetingid=" + meetingid +
                ", taskid=" + taskid +
                ", studentid='" + studentid + '\'' +
                ", personid='" + personid + '\'' +
                '}';
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voluntinfo.userid
     *
     * @mbg.generated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voluntinfo.meetingid
     *
     * @mbg.generated
     */
    private Integer meetingid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voluntinfo.taskid
     *
     * @mbg.generated
     */
    private Integer taskid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voluntinfo.studentid
     *
     * @mbg.generated
     */
    private String studentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column voluntinfo.personid
     *
     * @mbg.generated
     */
    private String personid;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voluntinfo
     *
     * @mbg.generated
     */
    public Voluntinfo(Integer userid, Integer meetingid, Integer taskid, String studentid, String personid) {
        this.userid = userid;
        this.meetingid = meetingid;
        this.taskid = taskid;
        this.studentid = studentid;
        this.personid = personid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table voluntinfo
     *
     * @mbg.generated
     */
    public Voluntinfo() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voluntinfo.userid
     *
     * @return the value of voluntinfo.userid
     *
     * @mbg.generated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voluntinfo.userid
     *
     * @param userid the value for voluntinfo.userid
     *
     * @mbg.generated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voluntinfo.meetingid
     *
     * @return the value of voluntinfo.meetingid
     *
     * @mbg.generated
     */
    public Integer getMeetingid() {
        return meetingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voluntinfo.meetingid
     *
     * @param meetingid the value for voluntinfo.meetingid
     *
     * @mbg.generated
     */
    public void setMeetingid(Integer meetingid) {
        this.meetingid = meetingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voluntinfo.taskid
     *
     * @return the value of voluntinfo.taskid
     *
     * @mbg.generated
     */
    public Integer getTaskid() {
        return taskid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voluntinfo.taskid
     *
     * @param taskid the value for voluntinfo.taskid
     *
     * @mbg.generated
     */
    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voluntinfo.studentid
     *
     * @return the value of voluntinfo.studentid
     *
     * @mbg.generated
     */
    public String getStudentid() {
        return studentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voluntinfo.studentid
     *
     * @param studentid the value for voluntinfo.studentid
     *
     * @mbg.generated
     */
    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column voluntinfo.personid
     *
     * @return the value of voluntinfo.personid
     *
     * @mbg.generated
     */
    public String getPersonid() {
        return personid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column voluntinfo.personid
     *
     * @param personid the value for voluntinfo.personid
     *
     * @mbg.generated
     */
    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }
}