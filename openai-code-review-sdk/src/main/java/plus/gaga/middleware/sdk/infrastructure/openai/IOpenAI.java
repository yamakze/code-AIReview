package plus.gaga.middleware.sdk.infrastructure.openai;


import com.zhipu.oapi.service.v4.model.ChatCompletionRequest;
import com.zhipu.oapi.service.v4.model.ChatMessage;
import plus.gaga.middleware.sdk.infrastructure.openai.dto.ChatCompletionRequestDTO;
import plus.gaga.middleware.sdk.infrastructure.openai.dto.ChatCompletionSyncResponseDTO;

import java.util.List;

public interface IOpenAI {

    String completions( List<ChatMessage> messages) throws Exception;

}
