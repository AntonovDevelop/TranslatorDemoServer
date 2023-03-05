package statistics.service;

import statistics.model.dto.StatisticsDto;
import org.springframework.stereotype.Service;

@Service
public class StatisticsService {
    public void sendStatisticsToFileServer(StatisticsDto statisticsDto){
        //логика по отправке статистики на сервер
    }
}
