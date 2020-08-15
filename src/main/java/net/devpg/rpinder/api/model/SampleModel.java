package net.devpg.rpinder.api.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Accessors(fluent = true)
@NoArgsConstructor(staticName = "newInstance")
@Getter
@Setter
@ToString
public class SampleModel {
	private String someValue;
}
