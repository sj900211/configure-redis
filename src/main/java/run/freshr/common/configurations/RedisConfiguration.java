package run.freshr.common.configurations;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

/**
 * Redis 설정
 *
 * @author FreshR
 * @apiNote Redis 설정
 * @since 2024. 3. 28. 오전 9:41:35
 */
@Configuration
@EnableRedisRepositories("**.**.domain.**.repository.redis")
@RequiredArgsConstructor
public class RedisConfiguration {

  private final RedisProperties redisProperties;

  @Bean
  public RedisConnectionFactory redisConnectionFactory() {
    RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();

    configuration.setHostName(redisProperties.getHost());
    configuration.setPort(redisProperties.getPort());
    configuration.setPassword(redisProperties.getPassword());

    return new LettuceConnectionFactory(configuration);
  }

  @Bean
  public RedisTemplate<?, ?> redisTemplate() {
    RedisTemplate<byte[], byte[]> redisTemplate = new RedisTemplate<>();

    redisTemplate.setConnectionFactory(redisConnectionFactory());

    return redisTemplate;
  }

}
