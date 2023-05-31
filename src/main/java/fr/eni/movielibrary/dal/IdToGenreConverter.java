package fr.eni.movielibrary.dal;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Genre;
import fr.eni.movielibrary.bo.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IdToGenreConverter implements Converter<String, Genre> {

    @Autowired
    MovieService movieService;
        @Override
        public Genre convert(String from) {
                return movieService.getGenreById(Long.parseLong(from));
            }

    }

