package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.UserPasswordDO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPasswordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Mon Aug 03 19:21:00 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Mon Aug 03 19:21:00 CST 2020
     */
    int insert(UserPasswordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Mon Aug 03 19:21:00 CST 2020
     */
    int insertSelective(UserPasswordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Mon Aug 03 19:21:00 CST 2020
     */
    UserPasswordDO selectByPrimaryKey(Integer id);

    UserPasswordDO selectByUserId(Integer id);

    int updateByPrimaryKeySelective(UserPasswordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Mon Aug 03 19:21:00 CST 2020
     */
    int updateByPrimaryKey(UserPasswordDO record);
}