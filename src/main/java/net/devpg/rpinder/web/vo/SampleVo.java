package net.devpg.rpinder.web.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Accessors(fluent = true)
@AllArgsConstructor(staticName = "from")
@Getter
@ToString
public class SampleVo {
	private final String someValue;
}
