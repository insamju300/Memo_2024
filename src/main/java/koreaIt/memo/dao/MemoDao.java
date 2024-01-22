package koreaIt.memo.dao;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import koreaIt.memo.container.DBConnector;
import koreaIt.memo.dto.Memo;
import koreaIt.memo.util.DBUtil;
import koreaIt.memo.util.SecSql;

public class MemoDao {
	Connection conn;
	DBUtil dbUtil;
	{
		conn = DBConnector.getConnection();
		this.dbUtil = new DBUtil();
	}
	
	
	public List<Map<String, Object>> findAll(){
		SecSql sql = new SecSql();
		sql.append("SELECT * FROM Memo");
		List<Map<String, Object>> mapList = dbUtil.selectRows(conn, sql);
		
		return mapList;
	}

}
