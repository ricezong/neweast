package com.zong.east.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zong.east.bean.Account;
import com.zong.east.mapper.AccountMapper;
import com.zong.east.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/4 15:15
 * @Version 1.0
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {
}
