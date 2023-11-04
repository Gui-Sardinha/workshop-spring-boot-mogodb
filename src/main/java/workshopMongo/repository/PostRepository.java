package workshopMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import workshopMongo.domain.Post;

public interface PostRepository extends MongoRepository <Post, String >{

}
