package jp.co.rakus.Board.repository;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.rakus.Board.domain.Comment;

/**
 * 
 * 掲示板：コメントRepository
 * @author akihiko.yahiro
 *
 */
@Repository
public class CommentRepository {
	
	NamedParameterJdbcTemplate template;
	
	private static final RowMapper<Comment> commentRowMapper = (rs, i) -> {
		Comment comment = new Comment();
		comment.setId(rs.getInt("id"));
		comment.setName(rs.getString("name"));
		comment.setContent(rs.getString("content"));
		comment.setArticleId(rs.getInt("article_id"));
		return comment;
	};
	
	/**
	 * 全コメント検索リスト
	 * 
	 * @return　全コメント
	 */
	public List<Comment> findAll() {
		String sql = "SELECT id, name, content, article_id from comments ORDER BY id;";
		List<Comment> commentList = template.query(sql, commentRowMapper);
		return commentList;
	}
	

}
