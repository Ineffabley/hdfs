package cn.edu360.hdfs.datacollect;

import java.util.Timer;

public class DataCollectMain {
	
	public static void main(String[] args) {
		//定时目录
		Timer timer = new Timer();
        //调度任务
		timer.schedule(new CollectTask(), 0, 60*60*1000L);
		
		timer.schedule(new BackupCleanTask(), 0, 60*60*1000L);
		
	}
}
