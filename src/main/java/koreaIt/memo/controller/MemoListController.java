package koreaIt.memo.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import koreaIt.memo.dao.MemoDao;
import koreaIt.memo.dto.Memo;

/**
 * Servlet implementation class MemoListController
 */
@WebServlet("/memos")
public class MemoListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemoDao dao = new MemoDao();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Memo> memos = dao.findAll().stream().map(a -> new Memo(a)).toList();
		for(Memo memo: memos) {
			System.out.println(memo.getId() + ":" + memo.getRegDateString() + ":" + memo.getContent());
			
		}
		request.setAttribute("memos", memos);
		request.getRequestDispatcher("/view/memo/memos.jsp").forward(request, response);
		

		
	}



}
