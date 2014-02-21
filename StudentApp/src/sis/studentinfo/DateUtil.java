/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sis.studentinfo;

import java.util.*;

/**
 *
 * @author arturo.pina
 */
public class DateUtil {
    public Date createDate(int year, int month, int date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.getTime();
    }
}
