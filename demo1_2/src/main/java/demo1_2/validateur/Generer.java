package demo1_2.validateur;

import ca.ntro.app.NtroAppFx;
import ca.ntro.app.models.ModelRegistrar;
import ca.ntro.cards.validator.GeneratorApp;
import ca.ntro.cards.validator.Validator;
import ca.ntro.cards.validator.backend.GeneratorBackend;
import demo1_2.Demo2;

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
		registrar.registerModel(Demo2.class);
	}

	@Override
	protected void validateModels(Validator<Modele> validator) {
		validator.validateModel(Demo2.class);
		
	}

}
