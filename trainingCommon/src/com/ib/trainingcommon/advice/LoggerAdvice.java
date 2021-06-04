package com.ib.trainingcommon.advice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

import com.ib.trainingcommon.bo.Course;

public class LoggerAdvice {

	private static final Logger logger = LogManager.getLogger(LoggerAdvice.class);

	public void logBefore() {
		logger.debug("Avant appel methode");
	}

	public Course logAroundAvecParam(ProceedingJoinPoint pjp, Integer id) {
		Course livre = null;
		// Object[] args = new Object[1];
		List<Object> args = new ArrayList<Object>();
		// args[0] = 7;
		// args.add(new Integer(7));

		// interception du parametre
		args.add(new Integer(id));
		logger.debug("livre demande : " + id);
		try {
			// appel de la vraie methode
			livre = (Course) pjp.proceed(args.toArray());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return livre;
	}

	public List<Course> logAround(ProceedingJoinPoint pjp) {
		logger.debug("Avant appel methode Around");

		LocalDateTime debutMethode = LocalDateTime.now();
		LocalDateTime finMethode;
		List<Course> livres = null;
		try {
			// appel de la vraie methode
			livres = (List<Course>) pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// livres.clear();
		// Course livre = new Course(999, "125fdg566", "livre de l AOP" +
		// pjp.getSignature(), new Date());
		// livres.add(livre);
		logger.debug("Apres appel methode Around");

		finMethode = LocalDateTime.now();

		logger.debug("tps appel methode :" + String.valueOf(finMethode.getSecond() - debutMethode.getSecond())
				+ " secondes");

		return livres;
	}

	public void logAfter() {
		logger.debug("Apres appel methode");
	}
}
