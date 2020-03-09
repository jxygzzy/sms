package com.zjh.sms.dao.User;

import com.github.pagehelper.PageRowBounds;
import com.zjh.sms.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Description 学生用户mapper层
 * Author: zjh
 * Date2020/3/7 15:11
 **/
@Mapper
public interface StudentMapper {
  /**
   * description: 新增学生账号信息
   * @param user
   * @return void
   * @author zjh
   * @date 2020/3/4 23:05
   */
  void addStudent(User user);

  /**
   * description: 删除学生账号
   *
   * @param ids
   * @return void
   * @author zjh
   * @date 2019/8/29 14:55
   */
  void delete(@Param("ids") List<Integer> ids);

  /**
   * description: 修改学生账号
   *
   * @param user
   * @return void
   * @author zjh
   * @date 2019/8/29 14:55
   */
  void update(User user);

  /**
   * description: 获取学生账号信息列表
   * @param rowBounds
   * @author zjh
   * @return java.util.List<com.zjh.sms.dto.User>
   * @date 2020/3/4 23:05
   */
  List<User> getStudentList(PageRowBounds rowBounds,  @Param("condition") Map<String, Object> condition);
}
