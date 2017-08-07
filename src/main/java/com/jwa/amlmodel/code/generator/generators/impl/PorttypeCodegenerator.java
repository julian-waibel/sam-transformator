package com.jwa.amlmodel.code.generator.generators.impl;

import com.jwa.amlmodel.code.generator.generators.Codegenerator;
import com.jwa.amlmodel.code.generator.generators.CodegeneratorException;
import com.jwa.amlmodel.code.generator.generators.config.GlobalConfig;
import com.jwa.amlmodel.code.generator.generators.config.generated.impl.GeneratedPortConfig;
import com.jwa.amlmodel.code.generator.generators.config.generated.impl.GeneratedPorttypeConfig;

import org.cdlflex.models.CAEX.InternalElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PorttypeCodegenerator implements Codegenerator<GeneratedPorttypeConfig, GeneratedPortConfig> {
    private static final Logger LOGGER = LoggerFactory.getLogger(PorttypeCodegenerator.class);

    @Override
    public final GeneratedPorttypeConfig generate(final InternalElement node, final GeneratedPortConfig parentConfig, final GlobalConfig globalConfig) throws CodegeneratorException {
        LOGGER.trace("Generating port-type for xxx '" + "xxx" + "' ...");

        LOGGER.trace("Generating port-type for xxx '" + "xxx" + "' finished");

        return new GeneratedPorttypeConfig();
    }
}
