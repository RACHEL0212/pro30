package com.myspring.pro30.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.pro30.board.vo.ArticleVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List selectAllArticlesList() throws Exception{
		List<ArticleVO> articlesList = sqlSession.selectList("mapper.board.selectAllArticlesList");
		return articlesList;
	}
	
	@Override
	public int insertNewArticle(Map articleMap) throws Exception{
		int articleNO = selectNewArticleNO();
		articleMap.put("articleNO", articleNO);
		sqlSession.insert("mapper.board.insertNewArticle", articleMap);
		return articleNO;
	}
	
	private int selectNewArticleNO() throws DataAccessException{
		return sqlSession.selectOne("mapper.board.selectNewArticleNO");
	}
	
	@Override
	public ArticleVO selectArticle(int articleNO) throws Exception{
		return sqlSession.selectOne("mapper.board.selectArticle", articleNO);
	}
	
	@Override
	public void updateArticle(Map articleMap) throws Exception{
		sqlSession.update("mapper.board.updateArticle", articleMap);
	}
	
	@Override
	public void deleteArticle(int articleNO) throws Exception{
		sqlSession.delete("mapper.board.deleteArticle", articleNO);
	}
}
