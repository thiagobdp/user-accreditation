package br.com.useraccreditation.controller.form;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.useraccreditation.model.AccreditationTypeEnum;
import io.swagger.annotations.ApiModelProperty;

public class PayloadForm {

	@ApiModelProperty(value = "Type of the Accreditation")
	@NotNull
	private AccreditationTypeEnum accreditation_type;

	@ApiModelProperty(value = "Documents for Accreditation")
	@NotNull
	@NotEmpty
	@Size(min = 1)
	@Valid
	private List<DocumentForm> documents;

	public AccreditationTypeEnum getAccreditation_type() {
		return accreditation_type;
	}

	public void setAccreditation_type(AccreditationTypeEnum accreditation_type) {
		this.accreditation_type = accreditation_type;
	}

	public List<DocumentForm> getDocuments() {
		return documents;
	}

	public void setDocuments(List<DocumentForm> documents) {
		this.documents = documents;
	}
}
