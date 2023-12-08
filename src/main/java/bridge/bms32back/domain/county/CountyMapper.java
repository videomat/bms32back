package bridge.bms32back.domain.county;

import bridge.bms32back.business.county.CountyDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CountyMapper {

    @Mapping(source = "name", target = "countyName")
    @Mapping(source = "id", target = "countyId")
    CountyDto toCountyDto(County county);
    List<CountyDto> toCountyDtos(List<County> counties);
}