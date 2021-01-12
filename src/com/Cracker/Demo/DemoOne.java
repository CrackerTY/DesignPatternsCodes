package com.Cracker.Demo;

/**
 * 处理业务对象
 */
interface IUserBO{

    void setUserID(String userID);
    String getUserID();
    void setUserName(String userName);
    String getUserName();
    void setPassword(String password);
    String getPassword();

}

/**
 * 处理业务逻辑
 */
interface IUserBiz{
    boolean changePassword(String password);
    boolean deleteUser(IUserBO userBO);
    void mapUser(IUserBO userBO);
    boolean addRole(int roleID);
}

interface IUserInfo extends IUserBO,IUserBiz{

}

class UserInfo implements IUserInfo{

    @Override
    public void setUserID(String userID) {

    }

    @Override
    public String getUserID() {
        return null;
    }

    @Override
    public void setUserName(String userName) {

    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public void setPassword(String password) {

    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public boolean changePassword(String password) {
        return false;
    }

    @Override
    public boolean deleteUser(IUserBO userBO) {
        return false;
    }

    @Override
    public void mapUser(IUserBO userBO) {

    }

    @Override
    public boolean addRole(int roleID) {
        return false;
    }
}

public class DemoOne {

    public static void main(String[] args) {
        IUserInfo userInfo = new UserInfo();

        //我要赋值，我就认为它是个纯粹的BO
        IUserBO userBO = userInfo;
        userBO.setPassword("abc");

        //我要执行动作，我就认为它是个业务逻辑类
        IUserBiz userBiz = userInfo;
        userBiz.changePassword("123");
        userBiz.deleteUser(userBO);

    }

}
