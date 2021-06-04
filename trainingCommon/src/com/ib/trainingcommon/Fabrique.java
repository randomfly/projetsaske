package com.ib.trainingcommon;

import com.ib.trainingcommon.dao.ICourseDAO;
import com.ib.trainingcommon.dao.CourseBouchonDAO;
import com.ib.trainingcommon.dao.CourseDAO;

public class Fabrique {

	private static ICourseDAO livreDAO = new CourseDAO();
	private static ICourseDAO livreBouchonDAO = new CourseBouchonDAO();

	public ICourseDAO get(String obj) {

		switch (obj) {
		case "livreDAO":
			return livreDAO;

		case "livreBouchonDAO":
			return livreBouchonDAO;

		default:
			return null;

		}

	}
}
