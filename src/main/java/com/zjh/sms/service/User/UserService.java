package com.zjh.sms.service.User;

import com.zjh.sms.dto.User;

import java.util.Map;

/**
 * Description 登陆用户接口
 * Author: zjh
 * Date2019/10/21 21:01
 **/
public interface UserService {
  /**
  * description: 根据用户、密码登陆
  * @params: condition
  * @return: com.zjh.student_mis.dto.User
  * @Author: zjh
  * @Date: 2019/10/21 21:05
  */
  User getStudentInfo(Map<String, Object> condition);
  /**
   * description: 修改密码
   * @param condition
   * @return void
   * @author zjh
   * @Date: 2020/3/4 23:05
   */
  boolean update(Map<String, Object> condition);

}
