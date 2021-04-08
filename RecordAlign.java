package test;

import java.util.*;
import java.io.*;
class  RecordAlign implements Serializable, Comparable <RecordAlign> //오름차순 성적정렬
{
	
	private int subject_sql;
	private int subject_java;
	private int subject_c;
	private int subject_python;
	private int tot;
	private double avg;
	public RecordAlign(int subject_sql, int subject_java, int subject_c, int subject_python){
		
		this.subject_sql=subject_sql;
		this.subject_java=subject_java;
		this.subject_c=subject_c;
		this.subject_python=subject_python;
		this.tot=subject_sql+subject_java+subject_c+subject_python;
		this.avg= tot/4;
	}

	
	public int getSql(){ return subject_sql; }
	public int getJava(){ return subject_java; }
	public int getC(){ return subject_c; }
	public int getPython(){ return subject_python; }
	public int getTot(){ return tot; }
	public double getAvg(){ return avg; }

	public int compareTo(RecordAlign o){ 
        if(getTot()<o.getTot()) return -1;
        else if(getTot()==o.getTot()) return 0;
        else return 1;
    }
	 @Override
	public String toString() {
		return subject_sql+"," + subject_java+"," + subject_c+"," + subject_python + tot+"," + avg;
	}
}