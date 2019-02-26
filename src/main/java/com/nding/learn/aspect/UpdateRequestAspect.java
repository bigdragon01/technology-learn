package com.nding.learn.aspect;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class UpdateRequestAspect {

    @Around("execution(* com.nding.learn.controller.HelloController.addUser(..))")
    public Object log(ProceedingJoinPoint jp) throws Throwable {
        Object[] args = jp.getArgs();
        String source = jp.getSignature().toLongString();
        if (log.isInfoEnabled()) {
            log.info("request {}, args:{}", source, JSON.toJSONString(args));
        }
        try {
            Object o = jp.proceed();
            if (log.isInfoEnabled()) {
                log.info("request {}, result:{}", source, JSON.toJSONString(o));
            }
            return o;
        } catch (Throwable e) {
            log.error("request {} fail", e);
            throw e;
        }
    }
}
