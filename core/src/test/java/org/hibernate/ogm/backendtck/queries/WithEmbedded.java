/*
 * Hibernate OGM, Domain model persistence for NoSQL datastores
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.ogm.backendtck.queries;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;

@Indexed
@Entity
public class WithEmbedded {

	@Id
	private Long id;

	@Embedded
	@IndexedEmbedded
	private AnEmbeddable anEmbeddable;

	@Embedded
	@IndexedEmbedded
	private AnEmbeddable yetAnotherEmbeddable;

	public WithEmbedded() {
	}

	public WithEmbedded(Long id, AnEmbeddable anEmbeddable) {
		this.id = id;
		this.anEmbeddable = anEmbeddable;
	}

	public Long getId() {
		return id;
	}

	public AnEmbeddable getAnEmbeddable() {
		return anEmbeddable;
	}

	public AnEmbeddable getYetAnotherEmbeddable() {
		return yetAnotherEmbeddable;
	}

	public void setYetAnotherEmbeddable(AnEmbeddable yetAnotherEmbeddable) {
		this.yetAnotherEmbeddable = yetAnotherEmbeddable;
	}
}
