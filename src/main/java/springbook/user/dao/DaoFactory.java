package springbook.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//어플리케이션 컨텍스트 또는 빈팩토리가 사용할 설정정보라는 어노테이션
@Configuration
public class DaoFactory {
	//오브젝트 생성을 담당하는 IoC용 메소드라는 표시
	@Bean
	public UserDao userDao() {
		UserDao dao = new UserDao();
		dao.setConnectionMaker(connectionMaker());
		return dao;
	}

	@Bean
	public ConnectionMaker connectionMaker() {
		ConnectionMaker connectionMaker = new DConnectionMaker();
		return connectionMaker;
	}
}
