package com.jwa.amlmodel.code.generator.generators.impl;

import com.jwa.amlmodel.code.generator.generators.Codegenerator;
import com.jwa.amlmodel.code.generator.generators.CodegeneratorException;
import com.jwa.amlmodel.code.generator.generators.config.GlobalConfig;
import com.jwa.amlmodel.code.generator.generators.config.generated.impl.GeneratedPortConfig;
import com.jwa.amlmodel.code.generator.generators.config.generated.impl.GeneratedPortparametersConfig;

import org.cdlflex.models.CAEX.InternalElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PortparametersCodegenerator implements Codegenerator<GeneratedPortConfig, GeneratedPortparametersConfig> {
    private static final Logger LOGGER = LoggerFactory.getLogger(PortparametersCodegenerator.class);

    @Override
    public final GeneratedPortparametersConfig generate(final InternalElement node, final GeneratedPortConfig parentConfig, final GlobalConfig globalConfig) throws CodegeneratorException {
        LOGGER.trace("Generating port-parameters for xxx '" + "xxx" + "' ...");

        LOGGER.trace("Generating port-parameters for xxx '" + "xxx" + "' finished");

        return new GeneratedPortparametersConfig();
    }
}