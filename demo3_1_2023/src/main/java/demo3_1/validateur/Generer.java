package demo3_1.validateur;

import ca.ntro.app.NtroAppFx;
import ca.ntro.app.models.ModelRegistrar;
import ca.ntro.cards.validator.GeneratorApp;
import ca.ntro.cards.validator.Validator;
import ca.ntro.cards.validator.backend.GeneratorBackend;
import demo3_1.etape0.Etape0;
import demo3_1.etape1.Etape1;
import demo3_1.etape2.Etape2;
import demo3_1.etape3.Etape3;

public class Generer extends GeneratorApp<Modele>{

	public static void main(String[] args) {
		NtroAppFx.launch();
	}

	@Override
	protected Class<? extends GeneratorBackend> backendClass() {
		return Backend.class;
	}

	@Override
	protected void registerAdditonalModels(ModelRegistrar registrar) {
		registrar.registerModel(Etape0.class);
		registrar.registerModel(Etape1.class);
		registrar.registerModel(Etape2.class);
		registrar.registerModel(Etape3.class);
	}

	@Override
	protected void validateModels(Validator<Modele> validator) {
		validator.validateModel(Etape0.class);
		validator.validateModel(Etape1.class);
		validator.validateModel(Etape2.class);
		validator.validateModel(Etape3.class);
		
	}

}
