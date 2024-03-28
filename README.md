# Configure > Redis
> Redis 설정 및 정의
> - ## [RedisConfiguration](./src/main/java/run/freshr/common/configurations/RedisConfiguration.java)
>> Lettuce 로 RedisConnectionFactory 를 통해 Redis 와 연결하도록 설정  
>> Redis 데이터를 저장하고 조회하는 RedisTemplate 설정
> - ## [UnitDocumentDefaultExtension](./src/main/java/run/freshr/common/extensions/unit/UnitDocumentDefaultExtension.java)
>> NoSql Unit 의 공통 기능 정의  
>> Unit 의 대한 자세한 내용은 `library-core-unit` 를 참고