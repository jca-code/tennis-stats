package org.jca.tennisstats.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class RankData {
	private Long rank;
	private Long points;
	private Long weight;
	private Long height;
	private Long age;
	
	@ElementCollection(targetClass=Long.class)
	private List<Long> last;

	public RankData() {
	}

	public Long getRank() {
		return rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public Long getHeight() {
		return height;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public List<Long> getLast() {
		return last;
	}

	public void setLast(List<Long> last) {
		this.last = last;
	}
	
	

}
