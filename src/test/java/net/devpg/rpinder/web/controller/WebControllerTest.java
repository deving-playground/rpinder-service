package net.devpg.rpinder.web.controller;

import static org.hamcrest.core.StringContains.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@WebMvcTest(WebController.class)
class WebControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@DisplayName("메인 페이지의 모델 속성을 확인합니다.")
	@Test
	void start_main_page_test() throws Exception {
		// given
		String viewName = "main";
		ResultActions actions = mockMvc.perform(get("/"));

		// when
		actions.andExpect(status().isOk());

		// then
		actions.andDo(print())
			.andExpect(view().name(viewName))
			.andExpect(model().attribute("message", "hello-world"))
			.andExpect(content().string(containsString("hello-world")));
	}
}