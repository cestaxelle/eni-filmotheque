package fr.eni.movielibrary.dal;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IdListToParticipantsConverter implements Converter<String, List<Participant>> {

    @Autowired
    MovieService movieService;
        @Override
        public List<Participant> convert(String from) {
            List<Participant> participants = new ArrayList<Participant>();
            String[] data = from.split(",");
            for (String info : data) {
                participants.add(movieService.getParticipantById(Long.parseLong(info)));
            }
            return participants;
            }

    }

