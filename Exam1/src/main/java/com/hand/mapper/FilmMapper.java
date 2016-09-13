package com.hand.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hand.model.Film;

public class FilmMapper implements RowMapper<Film>{
	public Film mapRow(ResultSet rs, int rowNum) throws SQLException {
		Film film = new Film();
		film.setFilm_id(rs.getInt("film_id"));
		film.setDescription(rs.getString("description"));
		film.setTitle(rs.getString("title"));
		film.setLanguage_id(rs.getInt("language_id"));
	      return film;
	   }
}
