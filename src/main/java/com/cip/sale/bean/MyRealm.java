package com.cip.sale.bean;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;


public class MyRealm  extends AuthorizingRealm{
	@Resource
 //   private UserServiceImp userService;
	
	// 为当前登陆成功的用户授予权限和角色，已经登陆成功了
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		 String username = (String) arg0.getPrimaryPrincipal(); //获取用户名
	        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
	      //  authorizationInfo.setRoles(userService.getRoles(username));
	       // authorizationInfo.setStringPermissions(userService.getPermissions(username));
	        return authorizationInfo;
	}

	 // 验证当前登录的用户，获取认证信息
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = (String) token.getPrincipal(); // 获取用户名
        //User user = userService.getByUsername(username);
//        if(user != null) {
//         //   AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), "myRealm");
//        //    return authcInfo;
//        } else {
//            return null;
//        }  
		return null;
	}

}
